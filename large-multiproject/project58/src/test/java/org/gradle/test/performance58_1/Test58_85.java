package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_85 {
    private final Production58_85 production = new Production58_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}