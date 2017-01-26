package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_85 {
    private final Production25_85 production = new Production25_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}