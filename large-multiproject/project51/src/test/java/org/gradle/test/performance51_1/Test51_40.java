package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_40 {
    private final Production51_40 production = new Production51_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}