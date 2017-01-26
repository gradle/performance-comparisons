package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_238 {
    private final Production51_238 production = new Production51_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}