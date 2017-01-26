package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_425 {
    private final Production19_425 production = new Production19_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}