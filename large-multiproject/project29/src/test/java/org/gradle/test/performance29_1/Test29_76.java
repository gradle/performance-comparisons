package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_76 {
    private final Production29_76 production = new Production29_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}