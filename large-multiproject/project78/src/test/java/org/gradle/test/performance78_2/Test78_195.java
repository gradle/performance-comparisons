package org.gradle.test.performance78_2;

import static org.junit.Assert.*;

public class Test78_195 {
    private final Production78_195 production = new Production78_195("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}