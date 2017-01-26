package org.gradle.test.performance70_4;

import static org.junit.Assert.*;

public class Test70_353 {
    private final Production70_353 production = new Production70_353("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}