package org.gradle.test.performance17_3;

import static org.junit.Assert.*;

public class Test17_255 {
    private final Production17_255 production = new Production17_255("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}