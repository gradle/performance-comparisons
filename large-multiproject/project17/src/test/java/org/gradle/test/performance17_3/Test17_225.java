package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_225 {
    private final Production17_225 production = new Production17_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}