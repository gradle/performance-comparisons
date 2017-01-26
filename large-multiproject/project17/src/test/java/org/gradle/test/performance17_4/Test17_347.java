package org.gradle.test.performance17_4;

import static org.junit.Assert.*;

public class Test17_347 {
    private final Production17_347 production = new Production17_347("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}