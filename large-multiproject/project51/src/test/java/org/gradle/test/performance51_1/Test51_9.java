package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_9 {
    private final Production51_9 production = new Production51_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}