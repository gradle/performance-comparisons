package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_85 {
    private final Production98_85 production = new Production98_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}