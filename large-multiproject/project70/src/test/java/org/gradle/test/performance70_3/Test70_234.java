package org.gradle.test.performance70_3;

import static org.junit.Assert.*;

public class Test70_234 {
    private final Production70_234 production = new Production70_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}