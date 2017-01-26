package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_406 {
    private final Production34_406 production = new Production34_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}