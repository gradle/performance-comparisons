package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_465 {
    private final Production34_465 production = new Production34_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}