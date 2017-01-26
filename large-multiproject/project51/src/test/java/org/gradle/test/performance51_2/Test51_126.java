package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_126 {
    private final Production51_126 production = new Production51_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}