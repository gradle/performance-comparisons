package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_85 {
    private final Production37_85 production = new Production37_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}