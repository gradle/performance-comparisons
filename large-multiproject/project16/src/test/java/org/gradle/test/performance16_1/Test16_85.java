package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_85 {
    private final Production16_85 production = new Production16_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}