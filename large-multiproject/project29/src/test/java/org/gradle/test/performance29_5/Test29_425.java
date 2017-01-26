package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_425 {
    private final Production29_425 production = new Production29_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}