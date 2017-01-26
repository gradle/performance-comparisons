package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_432 {
    private final Production34_432 production = new Production34_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}