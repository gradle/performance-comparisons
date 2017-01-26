package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_85 {
    private final Production5_85 production = new Production5_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}