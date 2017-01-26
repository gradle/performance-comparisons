package org.gradle.test.performance51_3;

import static org.junit.Assert.*;

public class Test51_214 {
    private final Production51_214 production = new Production51_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}