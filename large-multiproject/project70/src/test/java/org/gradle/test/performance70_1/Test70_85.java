package org.gradle.test.performance70_1;

import static org.junit.Assert.*;

public class Test70_85 {
    private final Production70_85 production = new Production70_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}