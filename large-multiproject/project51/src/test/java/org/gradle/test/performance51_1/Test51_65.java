package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_65 {
    private final Production51_65 production = new Production51_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}