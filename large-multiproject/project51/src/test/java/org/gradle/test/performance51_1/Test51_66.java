package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_66 {
    private final Production51_66 production = new Production51_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}