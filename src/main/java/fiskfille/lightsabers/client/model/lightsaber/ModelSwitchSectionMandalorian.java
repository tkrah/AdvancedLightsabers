package fiskfille.lightsabers.client.model.lightsaber;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class ModelSwitchSectionMandalorian extends ModelBase
{
	public ModelRenderer body1;
	public ModelRenderer top1;
	public ModelRenderer body2;
	public ModelRenderer body4;
	public ModelRenderer body6;
	public ModelRenderer body8;
	public ModelRenderer body10;
	public ModelRenderer body15;
	public ModelRenderer body3;
	public ModelRenderer body5;
	public ModelRenderer body7;
	public ModelRenderer body9;
	public ModelRenderer body11;
	public ModelRenderer body13;
	public ModelRenderer body12;
	public ModelRenderer body14;
	public ModelRenderer body16;
	public ModelRenderer body17;
	public ModelRenderer body18;
	public ModelRenderer body19;
	public ModelRenderer top2;
	public ModelRenderer top3;
	public ModelRenderer top7;
	public ModelRenderer top4;
	public ModelRenderer top5;
	public ModelRenderer top6;
	public ModelRenderer top8;
	public ModelRenderer top9;
	public ModelRenderer top10;

	public ModelSwitchSectionMandalorian()
	{
		this.textureWidth = 64;
		this.textureHeight = 32;
		this.body10 = new ModelRenderer(this, 14, 6);
		this.body10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body10.addBox(-1.5F, -2.0F, 2.76F, 3, 2, 1, 0.0F);
		this.setRotateAngle(body10, 0.0F, 3.141592653589793F, 0.0F);
		this.body3 = new ModelRenderer(this, 0, 19);
		this.body3.setRotationPoint(-1.0F, 0.0F, 0.0F);
		this.body3.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(body3, 0.0F, -0.4721115626644662F, 0.0F);
		this.body8 = new ModelRenderer(this, 0, 11);
		this.body8.mirror = true;
		this.body8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body8.addBox(1.98F, -2.0F, -2.5F, 1, 2, 2, 0.0F);
		this.body6 = new ModelRenderer(this, 0, 11);
		this.body6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body6.addBox(-2.98F, -2.0F, -2.5F, 1, 2, 2, 0.0F);
		this.body17 = new ModelRenderer(this, 0, 6);
		this.body17.setRotationPoint(0.0F, -0.5F, -2.5F);
		this.body17.addBox(-2.5F, -0.5F, 5.5F, 5, 1, 4, 0.0F);
		this.top2 = new ModelRenderer(this, 14, 14);
		this.top2.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top2.addBox(-3.0F, -1.0F, 3.0F, 6, 1, 1, 0.0F);
		this.setRotateAngle(top2, 0.0F, 3.141592653589793F, 0.0F);
		this.body16 = new ModelRenderer(this, 0, 22);
		this.body16.setRotationPoint(0.0F, 0.0F, -7.5F);
		this.body16.addBox(-4.5F, -3.0F, 0.0F, 9, 3, 1, 0.0F);
		this.setRotateAngle(body16, 0.2617993877991494F, 0.0F, 0.0F);
		this.body4 = new ModelRenderer(this, 0, 19);
		this.body4.mirror = true;
		this.body4.setRotationPoint(1.5F, 0.0F, 3.76F);
		this.body4.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(body4, 0.0F, 0.46949356878647464F, 0.0F);
		this.body1 = new ModelRenderer(this, 18, 9);
		this.body1.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.body1.addBox(-1.5F, -1.0F, 2.76F, 3, 1, 1, 0.0F);
		this.top1 = new ModelRenderer(this, 14, 11);
		this.top1.setRotationPoint(0.0F, -1.87F, 0.2F);
		this.top1.addBox(-3.0F, -1.0F, 3.0F, 6, 2, 1, 0.0F);
		this.body15 = new ModelRenderer(this, 0, 0);
		this.body15.setRotationPoint(0.0F, -0.9F, 0.0F);
		this.body15.addBox(-4.5F, -1.0F, -7.5F, 9, 1, 5, 0.0F);
		this.setRotateAngle(body15, -0.2617993877991494F, 0.0F, 0.0F);
		this.body18 = new ModelRenderer(this, 0, 11);
		this.body18.setRotationPoint(3.5F, -0.5F, -2.5F);
		this.body18.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 10, 0.0F);
		this.top10 = new ModelRenderer(this, 20, 16);
		this.top10.mirror = true;
		this.top10.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top10.addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
		this.top4 = new ModelRenderer(this, 14, 16);
		this.top4.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top4.addBox(-0.4F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(top4, 0.0F, 0.7853981633974483F, 0.0F);
		this.top7 = new ModelRenderer(this, 22, 0);
		this.top7.mirror = true;
		this.top7.setRotationPoint(2.0F, 0.0F, 3.0F);
		this.top7.addBox(0.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F);
		this.top9 = new ModelRenderer(this, 25, 16);
		this.top9.mirror = true;
		this.top9.setRotationPoint(0.0F, 0.0F, -5.6F);
		this.top9.addBox(-0.6F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(top9, 0.0F, 0.7853981633974483F, 0.0F);
		this.body11 = new ModelRenderer(this, 0, 15);
		this.body11.setRotationPoint(-1.5F, 0.0F, 3.76F);
		this.body11.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(body11, 0.0F, -0.46949356878647464F, 0.0F);
		this.top8 = new ModelRenderer(this, 14, 16);
		this.top8.mirror = true;
		this.top8.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top8.addBox(-0.6F, -1.0F, -1.0F, 1, 2, 2, 0.0F);
		this.setRotateAngle(top8, 0.0F, -0.7853981633974483F, 0.0F);
		this.body19 = new ModelRenderer(this, 0, 11);
		this.body19.setRotationPoint(-3.5F, -0.5F, -2.5F);
		this.body19.addBox(-1.0F, -0.5F, -0.5F, 2, 1, 10, 0.0F);
		this.body5 = new ModelRenderer(this, 0, 19);
		this.body5.mirror = true;
		this.body5.setRotationPoint(1.0F, 0.0F, 0.0F);
		this.body5.addBox(0.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(body5, 0.0F, 0.4721115626644662F, 0.0F);
		this.top6 = new ModelRenderer(this, 20, 16);
		this.top6.setRotationPoint(0.0F, 0.0F, 0.0F);
		this.top6.addBox(-1.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
		this.top5 = new ModelRenderer(this, 25, 16);
		this.top5.setRotationPoint(0.0F, 0.0F, -5.6F);
		this.top5.addBox(-0.4F, -1.0F, -1.0F, 1, 1, 2, 0.0F);
		this.setRotateAngle(top5, 0.0F, -0.7853981633974483F, 0.0F);
		this.body9 = new ModelRenderer(this, 1, 15);
		this.body9.mirror = true;
		this.body9.setRotationPoint(2.48F, 0.0F, -0.5F);
		this.body9.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
		this.body13 = new ModelRenderer(this, 0, 15);
		this.body13.mirror = true;
		this.body13.setRotationPoint(1.5F, 0.0F, 3.76F);
		this.body13.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(body13, 0.0F, 0.46949356878647464F, 0.0F);
		this.body2 = new ModelRenderer(this, 0, 19);
		this.body2.setRotationPoint(-1.5F, 0.0F, 3.76F);
		this.body2.addBox(-1.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F);
		this.setRotateAngle(body2, 0.0F, -0.46949356878647464F, 0.0F);
		this.body12 = new ModelRenderer(this, 0, 15);
		this.body12.setRotationPoint(-1.0F, 0.0F, 0.0F);
		this.body12.addBox(-1.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(body12, 0.0F, -0.4721115626644662F, 0.0F);
		this.body14 = new ModelRenderer(this, 0, 15);
		this.body14.mirror = true;
		this.body14.setRotationPoint(1.0F, 0.0F, 0.0F);
		this.body14.addBox(0.0F, -2.0F, -1.0F, 1, 2, 1, 0.0F);
		this.setRotateAngle(body14, 0.0F, 0.4721115626644662F, 0.0F);
		this.top3 = new ModelRenderer(this, 22, 0);
		this.top3.setRotationPoint(-2.0F, 0.0F, 3.0F);
		this.top3.addBox(-1.0F, -1.0F, -6.0F, 1, 1, 6, 0.0F);
		this.body7 = new ModelRenderer(this, 1, 15);
		this.body7.setRotationPoint(-2.48F, 0.0F, -0.5F);
		this.body7.addBox(-0.5F, -1.0F, 0.0F, 1, 1, 3, 0.0F);
		this.body1.addChild(this.body10);
		this.body2.addChild(this.body3);
		this.body1.addChild(this.body8);
		this.body1.addChild(this.body6);
		this.body15.addChild(this.body17);
		this.top1.addChild(this.top2);
		this.body15.addChild(this.body16);
		this.body1.addChild(this.body4);
		this.body1.addChild(this.body15);
		this.body15.addChild(this.body18);
		this.top7.addChild(this.top10);
		this.top3.addChild(this.top4);
		this.top1.addChild(this.top7);
		this.top7.addChild(this.top9);
		this.body10.addChild(this.body11);
		this.top7.addChild(this.top8);
		this.body15.addChild(this.body19);
		this.body4.addChild(this.body5);
		this.top3.addChild(this.top6);
		this.top3.addChild(this.top5);
		this.body8.addChild(this.body9);
		this.body10.addChild(this.body13);
		this.body1.addChild(this.body2);
		this.body11.addChild(this.body12);
		this.body13.addChild(this.body14);
		this.top1.addChild(this.top3);
		this.body6.addChild(this.body7);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		this.body1.render(f5);
		GL11.glPushMatrix();
		GL11.glTranslatef(this.top1.offsetX, this.top1.offsetY, this.top1.offsetZ);
		GL11.glTranslatef(this.top1.rotationPointX * f5, this.top1.rotationPointY * f5, this.top1.rotationPointZ * f5);
		GL11.glScaled(0.92D, 1.0D, 0.9D);
		GL11.glTranslatef(-this.top1.offsetX, -this.top1.offsetY, -this.top1.offsetZ);
		GL11.glTranslatef(-this.top1.rotationPointX * f5, -this.top1.rotationPointY * f5, -this.top1.rotationPointZ * f5);
		this.top1.render(f5);
		GL11.glPopMatrix();
	}

	public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z)
	{
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}