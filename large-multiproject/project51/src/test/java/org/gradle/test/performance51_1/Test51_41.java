package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_41 {
    private final Production51_41 production = new Production51_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}