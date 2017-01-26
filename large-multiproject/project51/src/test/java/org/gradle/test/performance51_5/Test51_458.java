package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_458 {
    private final Production51_458 production = new Production51_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}