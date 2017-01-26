package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_72 {
    private final Production51_72 production = new Production51_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}