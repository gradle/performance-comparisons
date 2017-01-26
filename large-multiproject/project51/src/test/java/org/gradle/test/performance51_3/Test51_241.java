package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_241 {
    private final Production51_241 production = new Production51_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}