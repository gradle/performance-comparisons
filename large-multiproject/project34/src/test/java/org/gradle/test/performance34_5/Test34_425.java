package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_425 {
    private final Production34_425 production = new Production34_425("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}