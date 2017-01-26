package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_80 {
    private final Production51_80 production = new Production51_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}