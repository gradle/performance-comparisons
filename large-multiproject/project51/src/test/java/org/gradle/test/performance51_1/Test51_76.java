package org.gradle.test.performance51_1;

import static org.junit.Assert.*;

public class Test51_76 {
    private final Production51_76 production = new Production51_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}