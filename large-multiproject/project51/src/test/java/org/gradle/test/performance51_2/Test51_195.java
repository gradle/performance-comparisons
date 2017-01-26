package org.gradle.test.performance51_2;

import static org.junit.Assert.*;

public class Test51_195 {
    private final Production51_195 production = new Production51_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}