package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_406 {
    private final Production17_406 production = new Production17_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}