package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_207 {
    private final Production17_207 production = new Production17_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}