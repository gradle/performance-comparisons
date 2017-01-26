package org.gradle.test.performance65_3;

import static org.junit.Assert.*;

public class Test65_234 {
    private final Production65_234 production = new Production65_234("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}