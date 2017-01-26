package org.gradle.test.performancenull_461;

import static org.junit.Assert.*;

public class Testnull_46041 {
    private final Productionnull_46041 production = new Productionnull_46041("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}