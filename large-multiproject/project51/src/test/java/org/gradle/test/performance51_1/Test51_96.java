package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_96 {
    private final Production51_96 production = new Production51_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}