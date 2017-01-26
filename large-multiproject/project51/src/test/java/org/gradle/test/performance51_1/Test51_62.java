package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_62 {
    private final Production51_62 production = new Production51_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}