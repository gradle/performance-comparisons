package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_445 {
    private final Production29_445 production = new Production29_445("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}