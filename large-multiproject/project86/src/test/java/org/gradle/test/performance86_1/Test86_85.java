package org.gradle.test.performance86_1;

import static org.junit.Assert.*;

public class Test86_85 {
    private final Production86_85 production = new Production86_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}