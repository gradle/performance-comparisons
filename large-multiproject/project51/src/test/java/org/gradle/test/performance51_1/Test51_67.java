package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_67 {
    private final Production51_67 production = new Production51_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}