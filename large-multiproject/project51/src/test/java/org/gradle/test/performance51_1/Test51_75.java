package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_75 {
    private final Production51_75 production = new Production51_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}