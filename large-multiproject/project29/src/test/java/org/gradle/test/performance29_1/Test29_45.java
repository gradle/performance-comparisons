package org.gradle.test.performance29_1;

import static org.junit.Assert.*;

public class Test29_45 {
    private final Production29_45 production = new Production29_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}