package org.gradle.test.performance70_5;

import static org.junit.Assert.*;

public class Test70_475 {
    private final Production70_475 production = new Production70_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}