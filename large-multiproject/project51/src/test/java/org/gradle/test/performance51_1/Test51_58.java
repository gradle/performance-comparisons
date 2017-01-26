package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_58 {
    private final Production51_58 production = new Production51_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}