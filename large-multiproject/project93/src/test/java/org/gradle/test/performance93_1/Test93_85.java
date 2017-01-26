package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_85 {
    private final Production93_85 production = new Production93_85("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}