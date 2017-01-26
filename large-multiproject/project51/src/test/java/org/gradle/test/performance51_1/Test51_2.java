package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_2 {
    private final Production51_2 production = new Production51_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}