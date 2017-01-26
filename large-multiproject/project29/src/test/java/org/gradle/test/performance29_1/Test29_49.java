package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_49 {
    private final Production29_49 production = new Production29_49("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}