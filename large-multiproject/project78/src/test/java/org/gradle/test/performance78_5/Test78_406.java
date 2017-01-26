package org.gradle.test.performance78_5;

import static org.junit.Assert.*;

public class Test78_406 {
    private final Production78_406 production = new Production78_406("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}