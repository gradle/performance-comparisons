package org.gradle.test.performance17_1;

import static org.junit.Assert.*;

public class Test17_73 {
    private final Production17_73 production = new Production17_73("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}