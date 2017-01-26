package org.gradle.test.performance65_1;

import static org.junit.Assert.*;

public class Test65_9 {
    private final Production65_9 production = new Production65_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}