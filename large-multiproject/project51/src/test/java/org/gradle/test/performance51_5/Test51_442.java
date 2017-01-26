package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_442 {
    private final Production51_442 production = new Production51_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}