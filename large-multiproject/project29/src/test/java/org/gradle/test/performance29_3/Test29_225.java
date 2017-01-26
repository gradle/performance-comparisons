package org.gradle.test.performance29_3;

import static org.junit.Assert.*;

public class Test29_225 {
    private final Production29_225 production = new Production29_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}