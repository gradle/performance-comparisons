package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_432 {
    private final Production78_432 production = new Production78_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}